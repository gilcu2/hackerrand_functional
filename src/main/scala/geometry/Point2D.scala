package geometry

import arithmetic.Arithmetic._

case class Point2D(x: Int, y: Int) {

	def module_squared = sqr(x) + sqr(y)

	def module: Double = Math.sqrt(module_squared)

	def -(p: Point2D): Point2D = Point2D(x - p.x, y - p.y)

}
