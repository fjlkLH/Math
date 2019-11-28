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
public class Drive {
    public static void main(String[] args){
    	double[] values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 
    	        0.444, 0.44, 0.34496, 0.33, 0.3, 0.292, 0.667 }; 
    	
    	Base base = new Base();
    	base.testMean(values);
    }
}
