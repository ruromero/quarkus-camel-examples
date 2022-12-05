package camelk.routes;
//
// To run this integrations use:
//
//     kamel run examples/RestDSL.java
//
import org.apache.camel.Exchange;

public class OtherDSL extends org.apache.camel.builder.RouteBuilder {
    @Override
    public void configure() throws Exception {
        rest()
            .get("/other")
            .to("direct:hello");
    }
}