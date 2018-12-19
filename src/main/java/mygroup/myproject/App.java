package mygroup.myproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mygroup.myproject.model.Address;
import mygroup.myproject.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ObjectMapper mapper = new XmlMapper();
    		InputStream inputStream = new FileInputStream(new File("/home/parallels/demo/persons.xml"));
    		TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
    		List<Person> persons = mapper.readValue(inputStream, typeReference);
    		for(Person p :persons) {
    			System.out.println("name is "+p.getFirstName()+" city is "+p.getAddress().getCity()+" first car is "+p.getCars()[0]+" age is "+p.getAge());
    		}
    		Person person = new Person();
            person.setFirstName("Jack");
            person.setLastName("Ryan");
            person.setAge(29);
            person.setAddress(new Address("12 Street","Kirkland","98052"));
            person.setCars(new String[] {"Toyota Camary","Honda Accord"});
            
            mapper.writeValue(new File("/home/parallels/demo/personsOut.xml"), person);
            inputStream.close();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
