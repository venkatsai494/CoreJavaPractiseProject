package solution.leetcode;

public class MinimumHoursOfTrainingToWinACompetition {
    public static void main(String[] args) {
        MinimumHoursOfTrainingToWinACompetition mhottwc = new MinimumHoursOfTrainingToWinACompetition();
        System.out.println(mhottwc.minNumberOfHours(5, 3, new int[]{1,4,3,2}, new int[]{2,6,3,1}));//8
        System.out.println(mhottwc.minNumberOfHours(2, 4, new int[]{1}, new int[]{3}));//0
        System.out.println(mhottwc.minNumberOfHours(1, 1, new int[]{1,1,1,1}, new int[]{1,1,1,50}));//51
        System.out.println(mhottwc.minNumberOfHours(11, 23, new int[]{69,22,93,68,57,76,54,72,8,78,88,15,58,61,25,70,58,91,79,22,91,74,90,75,31,53,31,7,51,96,76,17,64,89,83,54,28,33,32,45,20}, new int[]{51,81,46,80,56,7,46,74,64,20,84,66,13,91,49,30,75,43,74,88,82,51,72,4,80,30,10,19,40,27,21,71,24,94,79,13,40,28,63,85,70}));//2323
    }
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int trainingRequiredToIncreaseEnergy = 0;
        int trainingRequiredToIncreaseExperience = 0;
        int currentExperience = initialExperience;
        int totalEnergyOfOpponents = 0;
        for(int a: energy){
            totalEnergyOfOpponents = totalEnergyOfOpponents + a;
        }
        if(!(initialEnergy>totalEnergyOfOpponents)){
            trainingRequiredToIncreaseEnergy = totalEnergyOfOpponents - initialEnergy + 1;
        }
        for(int exp: experience){
            if(currentExperience>exp){
                currentExperience = currentExperience + exp;
            }
            else{
                int neededExperience = exp - currentExperience +1;
                trainingRequiredToIncreaseExperience = trainingRequiredToIncreaseExperience + neededExperience;
                currentExperience = currentExperience + neededExperience + exp;
            }
        }
        return trainingRequiredToIncreaseEnergy + trainingRequiredToIncreaseExperience;
    }
}
