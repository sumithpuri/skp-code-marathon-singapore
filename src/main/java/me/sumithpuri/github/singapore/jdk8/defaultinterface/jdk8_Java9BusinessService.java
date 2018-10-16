package me.sumithpuri.github.singapore.jdk8.defaultinterface;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2018/09/java-se-9-whats-new-code-samples-0102.html	
 * Blog Short URL		https://goo.gl/dpxjEU
 * Package Prefix 		me.sumithpuri.github.singapore
 * Project Codename		singapore
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class jdk8_Java9BusinessService implements jdk8_PreJava9BusinessInterface {

	/*
	 * [the requirement now changes to add a new business method [doLegacyBusinessMethodThree()]
	 * -
	 * [with this, disruption will be caused to internal and externally packaged implementations
	 * [before java 8, external systems integrating with the api have to re-implement, re-compile 
	 * -
	 * ]another case is that in the project, there are multiple implementations of this api
	 * ]before java 8, re-implementation will be required for this newly added method in the api
	 * =
	 * ]with java 8, we added a default interface method in the interface, with a default implementation
	 * ]both the problems are handled without any need for re-implementation
	 * ]if the default implementation needs to be changed, it can be changed in the implementing class
	 * ]an abstract class can also be introduced to change common or shared implementation  
	 * 
	 * under these circumstances, we now have the default interface methods to our rescue
	 */
	@Override
	public void doLegacyBusinessMethodOne() {
		
		System.out.println("Core Business Method One");
	}

	@Override
	public void doLegacyBusinessMethodTwo() {
		
		System.out.println("Core Business Method Two");
	}

	@Override
	public void doNewBusinessMethodThree() {
		
		System.out.println("Attention - All Java Developers - Default Interfaces");
		System.out.println("The World is now a Newer Place from Java 8!");
	}
}
