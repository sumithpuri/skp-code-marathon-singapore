package me.sumithpuri.github.singapore.safevarargs;

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
public class jdk9_SafeVarargsOnPrivateMethod {

	public void demoSafeVarargsInJava9() {
		
		safeVarargsInJava9(24.00f, 03, 19, 82);
	}
	
	@SafeVarargs
	private void safeVarargsInJava9 (Float a, Integer... b) {

		System.out.println("Invoked a Private Instance Method with " + a + ", " + b[0] + ", " + b[1] + ", " + b[2]);
		System.out.println("With Java 9, @SafeVarargs is Allowed on Private Instance Methods!");
	}
}
