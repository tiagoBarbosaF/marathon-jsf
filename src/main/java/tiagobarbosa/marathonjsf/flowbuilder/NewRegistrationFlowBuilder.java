package tiagobarbosa.marathonjsf.flowbuilder;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import java.io.Serializable;

public class NewRegistrationFlowBuilder implements Serializable {
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newregistration";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + "2.xhtml");
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + "3.xhtml");
        flowBuilder.switchNode("newRegistrationPage2")
                .defaultOutcome(flowId)
                .switchCase()
                .condition("#{not empty testFlowBuilderBean.firstName and not empty testFlowBuilderBean.lastName}")
                .fromOutcome("newregistration2");
        flowBuilder.flowCallNode("callNewPendencies")
                .flowReference("", "newpendencies")
                .outboundParameter("userName", "#{testFlowBuilderBean.firstName}")
                .outboundParameter("userSurname", "#{testFlowBuilderBean.lastName}");
        flowBuilder.returnNode("exitToBegin").fromOutcome("/beginFlow.xhtml");
        flowBuilder.returnNode("exitToIndex").fromOutcome("/index.xhtml");
        flowBuilder.finalizer("#{testFlowBuilderBean.save()}");
        return flowBuilder.getFlow();
    }
}
