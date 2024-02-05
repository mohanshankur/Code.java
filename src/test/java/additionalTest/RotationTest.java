package additionalTest;

import additional.Rotation;
import org.junit.Assert;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
public class RotationTest {
    
        @org.junit.Test
        public void TestRotation()

        {
            Rotation r = new Rotation();
            Boolean out =r.Rotations("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee");
            Assert.assertTrue(out);
        }

        @org.junit.Test
        public void TestRotation1()

        {
            Rotation r1 = new Rotation();
            Boolean out =r1.Rotations("Mohan","Sai");
            Assert.assertFalse(out);
        }
    }


