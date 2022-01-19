import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class testRoboto {


    @Test

     public void saludoRespuesta(){
        Roboto roboto = new Roboto();
          String respuesta = roboto.responder("Hola!");
          assertThat(respuesta, equalTo("Hola humano!"));

    }

    @Test

    public void respondeSiLePreguntoQueTiempoHace(){
        Roboto roboto = new Roboto();
        String respuesta = roboto.responder("Que tiempo hace en Barcelona?");
        assertThat(respuesta, equalTo("Te vas a Barcelona y lo miras."));

    }

    @Test

    public void respondeSiLePreguntoQueTiempoHaceEnOtraCiudad(){
        Roboto roboto = new Roboto();
        String respuesta = roboto.responder("Que tiempo hace en Madrid?");
        assertThat(respuesta, equalTo("Te vas a Madrid y lo miras."));

    }

}
