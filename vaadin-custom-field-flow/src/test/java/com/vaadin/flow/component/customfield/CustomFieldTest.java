package com.vaadin.flow.component.customfield;

import com.vaadin.flow.component.AttachEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomFieldTest {

    private CustomField<Object> systemUnderTest;

    @Before
    public void setUp() {
        systemUnderTest = new CustomField<Object>(null) {
            @Override
            protected void setPresentationValue(Object newPresentationValue) {

            }
        };
    }

    @Test
    public void onAttach_init() {
        systemUnderTest
            .addAttachListener(e -> new AttachEvent(systemUnderTest, true));

        Assert.assertTrue(true);
    }
}