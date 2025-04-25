package creations.simpleFactory;

public class PostFactory {
	public static Post createPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            default:
                return new Post();
        }
    }
}
