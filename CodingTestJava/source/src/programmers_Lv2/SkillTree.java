package programmers_Lv2;

public class SkillTree {

	public static void main(String[] args) {
		String skill = "CBD"; 
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"}; 
		System.out.println(solution(skill, skill_trees)); 
	}

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int skill_index = 0;
        boolean flag = false;
        
        //�ʿ��� ��ų�� ������ŭ�� �迭
        String[] neededSkill = new String[skill.length()];
        neededSkill = skill.split(""); //C B D
        
        //�ܾ
        for(int i=0;i<skill_trees.length;i++){
            skill_index = 0;
            flag = false;
            String temp = skill_trees[i];
            //���ں�
            for(int j=0;j<temp.length();j++){ //BACDE
                if(skill_index<skill.indexOf(temp.charAt(j))){
                    flag = false;
                    break;
                } else if (skill_index == skill.indexOf(temp.charAt(j))) {
                    flag = true;
					skill_index++;
				} else flag = true;
            }
            if(flag) answer++;
            System.out.println(answer);
        }
        
        return answer;
    }

}
