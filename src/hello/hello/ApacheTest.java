package hello;

import static org.junit.Assert.*;

import org.apache.commons.math3.linear.Array2DRowRealMatrix; 

import org.apache.commons.math3.linear.LUDecomposition; 

import org.apache.commons.math3.linear.RealMatrix; 

import org.apache.commons.math3.stat.descriptive.moment.GeometricMean; 

import org.apache.commons.math3.stat.descriptive.moment.Kurtosis; 

import org.apache.commons.math3.stat.descriptive.moment.Mean; 

import org.apache.commons.math3.stat.descriptive.moment.Skewness; 

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation; 

import org.apache.commons.math3.stat.descriptive.moment.Variance; 

import org.apache.commons.math3.stat.descriptive.rank.Max; 

import org.apache.commons.math3.stat.descriptive.rank.Min; 

import org.apache.commons.math3.stat.descriptive.rank.Percentile; 

import org.apache.commons.math3.stat.descriptive.summary.Product; 

import org.apache.commons.math3.stat.descriptive.summary.Sum; 

import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.junit.Test;



public class ApacheTest {
	double[] values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 
	        0.444, 0.44, 0.34496, 0.33, 0.3, 0.292, 0.667 }; 
	Apache test = new Apache();
	@SuppressWarnings("deprecation")
	@Test
	public void testGetMin() {
		Min min = new Min();
		assertEquals(test.getMin(min, values),min.evaluate(values),0.0001);
	}

	@Test
	public void testGetMax() {
		Max max = new Max();
		assertEquals(test.getMax(max, values),max.evaluate(values),0.0001);
	
	}

	@Test
	public void testGetMean() {
		Mean mean = new Mean();
		assertEquals(test.getMean(mean, values),mean.evaluate(values),0.0001);
	}

	@Test
	public void testGetProduct() {
		Product product = new Product();
		assertEquals(test.getProduct(product, values),product.evaluate(values),0.0001);
		
	}

	@Test
	public void testGetSum() {
		Sum sum = new Sum();
		assertEquals(test.getSum(sum, values),sum.evaluate(values),0.0001);
		
	}

	@Test
	public void testGetVariance() {
		Variance variance = new Variance();
		assertEquals(test.getVariance(variance, values),variance.evaluate(values),0.0001);
		
	}


}
