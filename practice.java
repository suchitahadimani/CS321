import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GreetingTest
{
    @Test
    void test() 
    {
        Greeting greeting = new Greeting();
        assertEquals(greeting.getMessage(), "Hello world!");
        assertThat(greeting.getMessage(), is("Hello world!"));
    }


    public static void main(String[] args){
        test();
    }



}

class Greeting
{
    public String getMessage(){
        return "Hello World!";
    }
}

