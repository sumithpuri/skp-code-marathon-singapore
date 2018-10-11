package me.sumithpuri.github.singapore.tryresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
public class jdk9_EffectivelyFinalTryResources {

	private static File file = new File("try_resources.j9"); 
	
	//with java 9, you need to use either explicitly final or effectively final variables in try/resources
	
	public void methodWithAnomaly() throws IOException {
		
		file.createNewFile();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		//prior to java 9, the usage would look like this
		//try (final BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
		
		//this code will not compile before java 9
		try (bufferedReader) {		
		
			System.out.println("Can Use Final or Effectively Final in Try with Resources!");
		} finally {
			
			System.out.println("Java 9 Gives More Flexibility to Developers.");
		}		
	}
}
