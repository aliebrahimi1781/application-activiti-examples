package org.xwiki.activiti.documentWorkflow;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class ImproveArticleTaskListener implements TaskListener
{

    private static final long serialVersionUID = 1L;

    @Override
    public void notify(DelegateTask delegateTask)
    {
        DelegateExecution execution = delegateTask.getExecution();
        System.out.println("Improve Article Task Listener");
        delegateTask.setDescription("Improve article " + execution.getVariable("documentName"));
    }
}
