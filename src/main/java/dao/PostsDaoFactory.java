package dao;

public class PostsDaoFactory {

    private static Posts PostsDao;

    public static Posts getPostsDao() {
        if (PostsDao == null) {
            PostsDao = new PostsDao();
        }
        return PostsDao;
    }

}

