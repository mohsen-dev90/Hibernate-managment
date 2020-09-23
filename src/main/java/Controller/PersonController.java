package Controller;

import Entity.Person;
import daoImpl.PersonDaoImp;
import managment.Dao.PersonDao;
import net.bytebuddy.implementation.bytecode.Throw;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonController extends HttpServlet {

    Person person = new Person();
    PersonDaoImp personDaoImpl = new PersonDaoImp();
    PersonDao dao;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("addPerson") !=null){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String role = request.getParameter("role");

            person.setLastName(lastName);
            person.setFirstName(firstName);
            person.setRole(person.getRole());
            personDaoImpl.savePerson(person);
            RequestDispatcher rd = request.getRequestDispatcher("PesonAdd.jsp");
            rd.forward(request,response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        if(request.getParameter("showPerson")!=null){
            List<Person> personList = new ArrayList();
            personList = personDaoImpl.showAllPerson();
            request.setAttribute("personlist",personList);
            RequestDispatcher rd = request.getRequestDispatcher("ShowAll.jsp");
            rd.forward(request,response);
        }
    }



}
