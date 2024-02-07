public class GitLab {
    public static void main(String[] args) throws Exception {
        GitLabHelper helper = new GitLabHelper(new String[] {"Name1",
        "Name2"});
        helper.PrintWelcomeMessage();    }
}

GitLabHelper helper = new GitLabHelper("Name1", "Name2");
helper.PrintWelcomeMessage();