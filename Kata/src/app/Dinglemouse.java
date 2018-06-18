package app;

public class Dinglemouse
{

	public static int[] humanYearsCatYearsDogYears(final int humanYears)
	{
		int catage = 15;
		int dogage = 15;
        int result[] = new int[2];
        result =humanYearsCornerCase(humanYears,catage,dogage);
        catage = result[0];
        dogage = result[1];
        result = humanYearsGeneralCase(humanYears,catage,dogage);

		return new int[] { humanYears, result[0], result[1] };
	}

	 private static int[] humanYearsCornerCase(int inputYears, int inputCatAge, int inputDogAge) {
			int[] resultArr = new int [2];

			if (inputYears > 1)
			{
				inputCatAge = inputCatAge + 9;
				inputDogAge = inputDogAge + 9;
			}
			
			resultArr[0] = inputCatAge;
			resultArr[1] = inputDogAge;
			
		 return resultArr;
	 }
	 
	 private static int[] humanYearsGeneralCase(int inputYears, int inputCatAge, int inputDogAge) {
		
		 int[] resultArr = new int[2];
			if (inputYears > 2)
			{
				inputCatAge = inputCatAge + (inputYears - 2) * 4;
				inputDogAge = inputDogAge + (inputYears - 2) * 5;
			}
			resultArr[0] = inputCatAge;
			resultArr[1] = inputDogAge;
		 return resultArr;
	 }
	 
	 
}
