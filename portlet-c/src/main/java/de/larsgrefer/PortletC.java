package de.larsgrefer;
import org.joinfaces.autoconfigure.primefaces.PrimefacesFileUploadServletContextAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = PrimefacesFileUploadServletContextAutoConfiguration.class)
public class PortletC extends SpringBootServletInitializer {

    public PortletC() {
        setRegisterErrorPageFilter(false);
    }
}
