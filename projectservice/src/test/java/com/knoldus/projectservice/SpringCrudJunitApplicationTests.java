//package com.knoldus.projectservice;
//
//import com.knoldus.projectservice.Dao.ProjectRepository;
//import com.knoldus.projectservice.Model.TeamMembers;
//import com.knoldus.projectservice.Model.Project;
//import com.knoldus.projectservice.Service.StudioServiceImpl;
//import org.junit.Assert;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentCaptor;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//class SpringCrudJunitApplicationTests {
//
//    @Mock
//    ProjectRepository employeeRepository;
//
//    @InjectMocks
//    private StudioServiceImpl employeeService;
//
//    Project project;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        project = new Project(3,
//                "Priya", "Priya@test.com", new TeamMembers("USA", "Manhattan", 555));
//    }
//
//    @Test
//    void testAddEmployee() {
//        when(employeeRepository.save(project))
//                .thenReturn(project);
//        Project saveRecords = employeeService.addEmployee(project);
//        Assert.assertEquals("It is equal", project, saveRecords);
//
//    }
//
//    @Test
//    void testFetchAllEmployees() {
//        List<Project> employeesList = new ArrayList<>();
//        employeesList.add(project);
//        employeesList.add(new Project(12, "Harvey", "Harvey@Jp",
//                new TeamMembers("Manhattan", "New York", 144)));
//        employeesList.add(new Project(20, "Jersey", "Jersey@Jp",
//                new TeamMembers("UK", "UK", 441)));
//
//        when(employeeRepository.findAll())
//                .thenReturn(employeesList);
//        List<Project> testProjectList = employeeService.fetchAllEmployees();
//        Assert.assertEquals("Same list returned!", employeesList, testProjectList);
//
//    }
//
//    @Test
//    void testUpdateById() {
//        //Creating an employee object to update
//        Project toBeUpdated = (new Project(12, "Harvey", "Harvey@Jp",
//                new TeamMembers("Manhattan", "New York", 144)));
//
//        //Creating an updatedEmployeeObject
//        Project updatedProject = (new Project(12, "Donna", "Donna@Jp",
//                new TeamMembers("Manhattan", "New York", 244)));
//
//
//        //The thenReturn method is then called on this mock object to return an optional of the
//        // toBeUpdated object when the findById method is called with any long parameter.
//        when(employeeRepository.findById(anyLong()))
//                .thenReturn(Optional.of(toBeUpdated));
//
//        Project projectResponseEntity = employeeService.updateById(updatedProject, 12L);
//
////	System.out.println(employeeResponseEntity.equals(updatedEmployee)+"------------------------------------------------------------------------------------------------------------");
//        System.out.println(projectResponseEntity);
//        System.out.println(updatedProject);
////	verify(employeeRepository).save(updatedEmployee);
//
//        //Finally, the ArgumentCaptor is used to capture the argument that was passed to the save method of the employeeRepository mock
//        ArgumentCaptor<Project> argument = ArgumentCaptor.forClass(Project.class);
////	System.out.println(argument.getValue());
//        verify(employeeRepository).save(argument.capture());
//        Project updatedProjectCapture = argument.getValue();
//        Assert.assertEquals("Same employee updated!", projectResponseEntity, updatedProjectCapture);
//    }
//
//    @Test
//    public void testDeleteMethod() {
//        Project toBeDeleted = (new Project(12, "Harvey", "Harvey@Jp",
//                new TeamMembers("Manhattan", "New York", 144)));
//
//        when(employeeRepository.findById(anyLong()))
//                .thenReturn(Optional.of(toBeDeleted));
//
//        Optional<Project> deletedEmployeeService = employeeService.deleteEmployeeById(1L);
//
//        ArgumentCaptor<Project> argument = ArgumentCaptor.forClass(Project.class);
//        verify(employeeRepository).delete(argument.capture());
//        Project deletedProject = argument.getValue();
//        Assert.assertEquals("Deleted the same employee!", toBeDeleted, deletedProject);
//
//    }
//
//    @Test
//    public void testDeleteByName(){
//        Project toBeDeleted = (new Project(11,"Donna", "Donna@suits.com",
//                new TeamMembers("Manhattan", "New York", 144)));
//
//        when(employeeRepository.findByEmpName(anyString()))
//                .thenReturn(Optional.of(toBeDeleted));
//
//        Optional<Project> deletedEmployeeByNameOptional = employeeService.deleteEmployeeByName("Donna");
//
//        ArgumentCaptor<Project> argumentCaptor = ArgumentCaptor.forClass(Project.class);
//        verify(employeeRepository).delete(argumentCaptor.capture());
//        Project deletedProjectByName = argumentCaptor.getValue();
//        Assert.assertEquals(deletedEmployeeByNameOptional.get(), deletedProjectByName);
//
//    }
//
//
//}
