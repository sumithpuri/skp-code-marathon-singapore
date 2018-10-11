package me.sumithpuri.github.singapore.processapi;

import java.lang.ProcessHandle.Info;

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
 * rights to use, copy, modify, merge, publish, distribute, sublicense,and/or sell copies of the Software, and to permit 
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
public class jdk9_ProcessAPIChanges {

	
	public void detailedAPIInfo(ProcessHandle processHandle) {
		
		Info processInfo = processHandle.info();
		
		System.out.println("[Java 9 Developers... Check this Out!]");
		System.out.println("[Detailed Process Info is Provided Below]");
		System.out.println("[Executable Name] " + processInfo.command().get());
		System.out.println("[User Name] " + processInfo.user().get());
		System.out.println("[Start Time] " + processInfo.startInstant().get().toString());
		System.out.println("+++++");
	}
	
	public static void main(String[] args) {
		
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
}
