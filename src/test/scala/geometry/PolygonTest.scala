package geometry

import org.scalatest.GivenWhenThen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalactic._

class PolygonTest extends AnyFlatSpec with GivenWhenThen with Matchers {

	"A set of points" should "have a  perimeter" in {

		implicit val doubleEquality = TolerantNumerics.tolerantDoubleEquality(0.01)

		Given("a polygon")
		val polygon = Polygon(Array(
			Point2D(0, 0),
			Point2D(1, 0),
			Point2D(0, 1)
		))

		And("the expected perimeter")
		val expectedPerimeter = 3.41

		When("the perimeter is computed")
		val perimeter = polygon.getPerimeter

		Then("the sequence should have the expected length")
		perimeter === expectedPerimeter

	}

	"A polygon" should "have a convex hull" in {
		Given("a polygon")
		val polygon = Polygon(Array(
			Point2D(0, 0),
			Point2D(3, 0),
			Point2D(0, 3),
			Point2D(1, 1)
		))

		And("the expected convex hull polygon")
		val expectedConvexHull = Polygon(Array(
			Point2D(0, 0),
			Point2D(3, 0),
			Point2D(0, 3)
		))

		When("the convex hull is computed")
		val convexHull = polygon.computeConvexHullJarvis

		Then("the sequence should have the expected length")
		convexHull shouldBe expectedConvexHull

	}

}
