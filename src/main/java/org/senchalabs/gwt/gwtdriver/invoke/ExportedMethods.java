package org.senchalabs.gwt.gwtdriver.invoke;

/*
 * #%L
 * gwt-driver
 * %%
 * Copyright (C) 2012 - 2013 Sencha Labs
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.openqa.selenium.WebElement;

public interface ExportedMethods extends ClientMethods {
	boolean isWidget(WebElement elt);
	
	boolean instanceofwidget(WebElement elt, String type);
	
	String getContainingWidgetClass(WebElement elt);
	
	WebElement getContainingWidgetElt(WebElement elt);
	
	WebElement getContainingWidgetEltOfType(WebElement elt, String type);
	
//	String getClass(Object obj);
	
//	String instanceOf(String type, Object instance);
}
