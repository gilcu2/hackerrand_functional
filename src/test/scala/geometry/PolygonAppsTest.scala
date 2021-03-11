package geometry

import org.scalatest.GivenWhenThen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PolygonAppsTest extends AnyFlatSpec with GivenWhenThen with Matchers {

	"A set of points" should "have a convex hull perimeter" in {
		Given("a set of points")
		val points = Array(
			Point2D(1, 1),
			Point2D(2, 5),
			Point2D(3, 3),
			Point2D(5, 3),
			Point2D(3, 2),
			Point2D(2, 2)
		)

		And("the expected perimeter")
		val expectedPerimeter = 4

		When("the perimeter is computed")
		val perimeter = PolygonApps.getPerimeterConvexHull(points)

		Then("the sequence should have the expected length")
		perimeter shouldBe expectedPerimeter

	}

}