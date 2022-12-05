package camelk.routes;
//
// To run this integrations use:
//
//     kamel run examples/RestDSL.java
//
import org.apache.camel.Exchange;

public class RestDSL extends org.apache.camel.builder.RouteBuilder {
    @Override
    public void configure() throws Exception {
        rest()
            .get("/hello")
            .to("direct:hello");

        from("direct:hello")
            .setHeader(Exchange.CONTENT_TYPE, constant("text/plain"))
            .transform().simple("Hello World");
    }
}