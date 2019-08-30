package sem3CTS;

public class Utils {
	public int posMinValue(int[] v) {
		int min = 999999;
		for(int i = 0; i < v.length; i++) {
			if(v[i] < min && v[i] >= 0)
				min = v[i];
		}
		if(min == 999999)
			return -1;
		return min;
		/*
		int min = 0;
		int ok = 0;
		for(int i = 0; i < v.length; i++) {
			if(v[i] >= 0)
				if(ok == 0) {
					ok = 1;
					min = v[i];
				}
				else
					if(v[i] < min)
						min = v[i];
		}
		if(ok == 0)
			return -1;
		return min;
		*/
	}
	
	int getPosition(int[] points, int x) {
		int position = 1;
		int i = 1;
		sortDesc(points);
		int k = 1;
		if(points[0] == x)
			return 1;
		while(k < points.length) {
			if(points[k] != points[k - 1]) {
				position++;
				if(points[k] == x)
					return position;
			}
			k++;
		}
		return -1;
	}
	
	int[] sortDesc(int[] array) {
		int var = 0;
		for(int i = 0; i < array.length; i++)
			for(int j = i + 1; j < array.length; j++)
				if(array[i] < array[j]) {
					var = array[i];
					array[i] = array[j];
					array[j] = var;
				}
		return array;
	}
}
