package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Horse horse = context.getBean("myHorse",Horse.class);
        System.out.println(horse);
        horse.animalMinus();
        horse.animalPlus();
        Person person = context.getBean("myPerson",Person.class);
        System.out.println(person);

    }
}
