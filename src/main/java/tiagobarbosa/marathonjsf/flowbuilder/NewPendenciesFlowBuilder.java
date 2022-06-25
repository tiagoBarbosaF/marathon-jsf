package tiagobarbosa.marathonjsf.flowbuilder;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import java.io.Serializable;

public class NewPendenciesFlowBuilder implements Serializable {
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newpendencies";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();
        flowBuilder.returnNode("proceedToNewRegistration3").fromOutcome("/newregistration/newregistration3.xhtml");
        flowBuilder.returnNode("exitToNewBegin").fromOutcome("/newregistration/newregistration.xhtml");
        flowBuilder.inboundParameter("userName", "#{testFlowBuilderNestedBean.userName}");
        flowBuilder.inboundParameter("userSurname", "#{testFlowBuilderNestedBean.userSurname}");
        return flowBuilder.getFlow();
    }
}
