package tutorial.spring.schema.extension;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CompanyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("company", new CompanyBeanDefinitionParser());
    }
}
