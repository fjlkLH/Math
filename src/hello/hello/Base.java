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
public class Base {
  public void testMean(double[] values) {
	  Apache test = new Apache();
	  Mean mean = new Mean();
	 if( test.getMean(mean, values) == mean.evaluate(values))
		 System.out.println("算数平均值计算正确！");
	 else
		 System.out.println("算数平均值计算不正确！");
  }
}
