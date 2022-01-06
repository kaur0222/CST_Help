package SwitchString;

public class AutoPolicyTest {

	public static void main(String[]args) {

		AutoPolicy policy1 = new AutoPolicy(11111111,"Range ROVER","NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222,"Ford FUSION","ME");
		
	policyInNoFaultState((policy1));
	policyInNoFaultState((policy2));
		
	}
	
	public static void policyInNoFaultState(AutoPolicy autoPolicy) {
		System.out.println("The Auto Policy:");
		System.out.printf("Account #: %d; Car: %s; %nState %s %s a no-fault state%n%n",
				autoPolicy.getAccountNumber(), autoPolicy.getMakeandModel()
				,autoPolicy.getState(), (autoPolicy.isNoFaultState() ? "is": "is not"));
	}
}
