package ar.com.juanek;

import ar.com.juanek.config.ConfigTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigTest.class)
public class ApplicationContextTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void context(){
        System.out.println(context);
    }

}
