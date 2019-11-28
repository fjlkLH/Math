package hello;

//packagetest.ffm83.commons.math;

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
 
 



public class Apache {
	public static double getMin(Min min,double[]values) {                                //��Сֵ
	return 	min.evaluate(values);
	}
	
	public static double getMax(Max min,double[]values) {                            //���ֵ
		return 	min.evaluate(values);
	}
	public static double getMean(Mean mean,double[]values) {                          //ƽ��ֵ
		return 	mean.evaluate(values);
	}
	public static double getProduct(Product product,double[]values) {               //�˻�             
		return 	product.evaluate(values);
	}
	public static double getSum(Sum sum,double[]values) {                             //���
		return 	sum.evaluate(values);
	}
	public static double getVariance(Variance variance,double[]values) {                   //����
		return 	variance.evaluate(values);
	}

   /*  public static void main(String[] args) { 

        double[] values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 }; 

        Min min = new Min(); 

        Max max = new Max(); 

         

        Mean mean = new Mean(); // ����ƽ��ֵ 

        Product product = new Product();//�˻� 

        Sum sum = new Sum(); 

        Variance variance = new Variance();//���� 

        System.out.println("min: " +getMin(min,values)); 

        System.out.println("max: " +getMax(max,values)); 

        System.out.println("mean: " +getMean(mean,values)); 

        System.out.println("product:" + getProduct(product,values)); 

        System.out.println("sum: " +getSum(sum,values)); 

        System.out.println("variance:" + getVariance(variance,values)); 

      //  System.out.println(System.getProperty("user.dir"));

      
    } */

}

