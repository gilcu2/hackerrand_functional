package sequence

import org.scalatest._
import matchers.should._
import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable

class SequenceTest extends AnyFlatSpec with GivenWhenThen with Matchers {

	"A sequence" should "have a lenght" in {
		Given("a sequence")
		val sequence = List(1,2,3,4)

		And("the expected length")
		val expectedLength=4

		When("the lenght is computed")
		val length=Sequence.length(sequence)

		Then("the sequence should have the expected length")
		length shouldBe expectedLength

	}

	"A integer sequence" should "be mapped to absolute values" in {
		Given("a sequence")
		val sequence = List(1,-2,3,-4)

		And("the expected absolute values")
		val expected=List(1,2,3,4)

		When("the mapping is computed")
		val mapped=Sequence.mapToAbsolute(sequence)

		Then("the sequence should should be the expected")
		mapped shouldBe expected

	}

}
