package geometry

case class Polygon(points: Array[Point2D]) {

	def getPerimeter: Double = {
		val d1 = points.sliding(2)
			.map(array => array(0) - array(1))
			.map(_.module)
			.sum
		val d2 = (points.head - points.last).module
		d1 + d2
	}

	def computeConvexHullJarvis: Polygon = {

	}

}

