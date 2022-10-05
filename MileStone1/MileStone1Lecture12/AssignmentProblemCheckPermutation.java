package MileStone1Lecture12;

public class AssignmentProblemCheckPermutation {


  // here we check the string permutation.
  // like we have to check that (srtnig) is permutation of the (string).
  // means (srtnig) have all the words to write it in corrent way  its like (string).

    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
    int n1 = str1.length();
    int n2 = str2.length();
 
    if (n1 != n2)
    return false;
    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();
 
    // Arrays.sort(ch1);
    // Arrays.sort(ch2);
 
    for (int i = 0; i < n1; i++)
    if (ch1[i] != ch2[i])
        return false;
 
    return true;
	}

    
}
