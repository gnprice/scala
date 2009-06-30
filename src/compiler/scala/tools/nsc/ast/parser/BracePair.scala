/* NSC -- new Scala compiler
 * Copyright 2005-2009 LAMP/EPFL
 * @author  Martin Odersky
 */
package scala.tools.nsc.ast.parser

/** A descriptor for a matching pair of braces.
 *  @param loff  The offset of the opening brace (-1 means missing)
 *  @param roff  The offset of the closing brace (-1 means missing)
 *  @param nested The brace pairs nested in this one
 */
case class BracePair(loff: Int, off: Int, nested: List[BracePair])