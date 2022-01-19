import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class testRoboto {


    @Test

     public void saludoRespuesta(){
        Roboto roboto = new Roboto();
          String respuesta = roboto.responder("Hola!");
          assertThat(respuesta, equalTo("hola humano!"));

    }

}
