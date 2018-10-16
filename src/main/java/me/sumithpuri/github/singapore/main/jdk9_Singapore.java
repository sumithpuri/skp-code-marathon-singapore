package me.sumithpuri.github.singapore.main;

import java.io.IOException;

import me.sumithpuri.github.singapore.conveniencecollections.jdk9_ConvenienceCollections;
import me.sumithpuri.github.singapore.diamondanyonymous.jdk9_DiamondOperatorOnAnonymous;
import me.sumithpuri.github.singapore.enhanceddeprecation.jdk9_EnhancedDeprecation;
import me.sumithpuri.github.singapore.illegalunderscore.jdk9_VariableNaming;
import me.sumithpuri.github.singapore.jdk8.defaultinterface.jdk8_Java9BusinessService;
import me.sumithpuri.github.singapore.jdk8.defaultinterface.jdk8_PreJava9BusinessInterface;
import me.sumithpuri.github.singapore.jdk8.defaultinterface.jdk8_PreJava9BusinessService;
import me.sumithpuri.github.singapore.privatedefaultinterface.jdk9_PrivateMethodInterface;
import me.sumithpuri.github.singapore.processapi.jdk9_ProcessAPIChanges;
import me.sumithpuri.github.singapore.safevarargs.jdk9_SafeVarargsOnPrivateMethod;
import me.sumithpuri.github.singapore.tryresources.jdk9_EffectivelyFinalTryResources;

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

/* 
 * You may run this main class to run all Demo Code of the  [Singapore]  Project. It demonstrates most important changes 
 * in Java 9. This shows top changes in Java 9, the next set of changes are covered in the [London] Project. 
 * 
 * You may access the code repository of the [London] Project by browsing at https://github.com/sumithpuri
 */
public class jdk9_Singapore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Singapore");
		System.out.println("Project Description   Java 9 Companion Code Samples");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/dpxjEU");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println();
		
		jdk9_Singapore java9Application = new jdk9_Singapore();
		
		//new features of java 9
		//java language changes in java 9 
		java9Application.java9LanguageChanges();	
		
		//new features of java 9
		//core java library changes in java 9 
		java9Application.java9CoreLibraryChanges();
	}
	
	//new features of java 9
	//java language changes in java 9 
	private void java9LanguageChanges() {
		
		//new features of java 9 (rewind to java 8)
		//default interface methods was introduced in java 8
		this.defaultInterfaceMethod();

		//new features of java 9
		//private interface methods
		this.privateInterfaceMethod();

		//new features of java 9
		//underscore not allowed as variable name
		this.underScoreVariableNaming();
		
		//new features of java 9
		//effectively final variables can be used in try 
		try {
			
			this.effectivelyFinalTryResources();
		} catch (Exception e) {
			
			System.out.println("Gulp! Gulp! Consumed this One.");
		}
		
		//new features of java 9
		//safevarargs annotation is allowed on private methods
		this.safeVarargsOnPrivateMethod();
		
		//new features of java 9
		//safevarargs annotation is allowed on private methods
		this.diamondOperatorOnAnonymousClasses();
	}
	
	//new features of java 9
	//core java library changes in java 9
	private void java9CoreLibraryChanges() {
		
		//new features of java 9 (core library changes)
		//process api provides pid and detailed process info
		this.coreLibProcessAPIChanges();
		
		//new features of java 9 (core library changes)
		//enhanced deprecation allows forremoval, since attributes		
		this.coreLibEnhancedDeprecation();
		
		//new features of java 9 (core library changes)
		//a new collection method allows to create immutable counterparts		
		this.convenienceCollectionMethod();
	}

	//new features of java 9
	//default interface methods
	private void defaultInterfaceMethod() {
		
		System.out.println("00. Default Interface Methods");
		System.out.println("-----------------------------");
		
		System.out.println("[Already Integrated Java Service - Default Implementation]");
		jdk8_PreJava9BusinessInterface java9BusinessService = new jdk8_PreJava9BusinessService();
		java9BusinessService.doLegacyBusinessMethodOne();
		java9BusinessService.doLegacyBusinessMethodTwo();
		java9BusinessService.doNewBusinessMethodThree();
		System.out.println("");
		System.out.println("[Newly Integrated Java Service - Override Default Implementation]");
		java9BusinessService = new jdk8_Java9BusinessService();
		java9BusinessService.doLegacyBusinessMethodOne();
		java9BusinessService.doLegacyBusinessMethodTwo();
		java9BusinessService.doNewBusinessMethodThree();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//private interface methods
	private void privateInterfaceMethod() {
		
		System.out.println("01. Private Interface Methods");
		System.out.println("-----------------------------");
		
		System.out.println("[Private Interface Method Invoked by Default Interface Method]");
		jdk9_PrivateMethodInterface java9PrivateMethodInterface = new jdk9_PrivateMethodInterface() {
			
			@Override
			public void preJava9BusinessMethodTwo() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void preJava9BusinessMethodOne() {
				// TODO Auto-generated method stub
				
			}
		};
		
		java9PrivateMethodInterface.newJava9BusinessMethodThree();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//underscore not allowed as variable name
	private void underScoreVariableNaming() {
		
		System.out.println("02. Underscore Variable Naming");
		System.out.println("-----------------------------");
		
		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
		jdk9_VariableNaming java9VariableNaming = new jdk9_VariableNaming();
		java9VariableNaming.notForDemoMethod();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//effectively final variables can be used in try 
	private void effectivelyFinalTryResources() throws IOException {
		
		System.out.println("03. Effectively Final Try with Resources");
		System.out.println("----------------------------------------");
		
		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
		jdk9_EffectivelyFinalTryResources effectivelyFinalTry = new jdk9_EffectivelyFinalTryResources();
		effectivelyFinalTry.methodWithAnomaly();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//safevarargs annotation is allowed on private methods
	private void safeVarargsOnPrivateMethod() {
		
		System.out.println("04. Safe Varargs on Private Method");
		System.out.println("----------------------------------");
		
		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
		jdk9_SafeVarargsOnPrivateMethod safeVarargsOnPrivateMethod = new jdk9_SafeVarargsOnPrivateMethod();
		safeVarargsOnPrivateMethod.demoSafeVarargsInJava9();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//diamond operator is now allowed on java 9 inner classes
	private void diamondOperatorOnAnonymousClasses() {
		
		System.out.println("05. Diamond on Anonymous Classes ");
		System.out.println("--------------------------------");
		
		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
		jdk9_DiamondOperatorOnAnonymous diamondAnonymous = new jdk9_DiamondOperatorOnAnonymous();
		diamondAnonymous.diamondForInferredDenotable();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//process api now retrieves pid and info of specific process
	//process api also allows a snapshot all running processes now
	private void coreLibProcessAPIChanges() {
		
		System.out.println("06. Process API Changes (Core Library) ");
		System.out.println("--------------------------------------");
		
		System.out.println("Check Out the Detailed Process Information in Java 9");
		jdk9_ProcessAPIChanges processAPIChanges = new jdk9_ProcessAPIChanges();
		
		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println("With Java 9, Process Id is Available");
		System.out.println("[Current Process Id] " + processHandle.pid());
		System.out.println("-------------------------------------");
		
		processAPIChanges.detailedAPIInfo(processHandle);
		System.out.println("-------------------------------------");
		System.out.println("With Java, You can View all Processes..");
		System.out.println("That are Visible to the Current Process!");
		ProcessHandle.allProcesses()
         .filter(ph -> ph.info().command().isPresent())
         .limit(4)
         .forEach((process) -> processAPIChanges.detailedAPIInfo(process));
		
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//enhanced deprecation allows [since] and [forremoval]
	private void coreLibEnhancedDeprecation() {
	
		System.out.println("07. Enhanced Deprecation");
		System.out.println("------------------------");
		
		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
		jdk9_EnhancedDeprecation enhancedDeprecation = new jdk9_EnhancedDeprecation();
		enhancedDeprecation.methodMarkedForRemoval();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	
	//new features of java 9
	//enhanced deprecation allows [since] and [forremoval]
	private void convenienceCollectionMethod() {
		
		System.out.println("08. Convenience Collection Method");
		System.out.println("---------------------------------");
		
		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
		
		jdk9_ConvenienceCollections convenienceCollections = new jdk9_ConvenienceCollections();
		convenienceCollections.checkItOut();
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
	
	//new features of java 9
	//variable handles
	//private void coreLibProcessAPIChanges() {
	//		
	//		System.out.println("07. Variable Handles in Java 9");
	//		System.out.println("------------------------------");
	//		
	//		System.out.println("[Nothing to Demonstrate - Refer Code for New Rule]");
	//		VariableHandle variableHandle = new VariableHandle();
	//		variableHandle.useVariableHandle();
	//		System.out.println("");
	//		System.out.println("================================");
	//		System.out.println("");
	//	}
}
