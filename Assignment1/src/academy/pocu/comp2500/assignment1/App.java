package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        // registry.registerPostAdder("Foo", "bar");
        registry.registerBlogCreator("Blog");
        registry.registerTagFilterSetter("Blog", "setTagFilter");
        registry.registerAuthorFilterSetter("Blog", "setUserFilter");
        registry.registerPostOrderSetter("Blog", "setSortingType");
        registry.registerPostListGetter("Blog", "getPost");
        registry.registerPostAdder("Blog", "addPost");
        registry.registerPostTitleUpdater("Post", "setTitle");
        registry.registerPostBodyUpdater("Post", "setBody");
        registry.registerPostTagAdder("Post", "addTag");
        registry.registerCommentAdder("Post", "addComment");
        registry.registerSubcommentAdder("Comment", "addSubComment");
        registry.registerCommentUpdater("Comment", "setText");
        registry.registerSubcommentUpdater("SubComment", "setText");
        registry.registerReactionAdder("Post", "addReaction");
        registry.registerReactionRemover("Post", "removeReaction");
        registry.registerCommentUpvoter("Comment", "upVoter");
        registry.registerCommentDownvoter("Comment", "downVoter");
        registry.registerCommentListGetter("Post", "getComment");
        registry.registerSubcommentListGetter("Comment", "getSubCommentList");
        registry.registerSubcommentUpvoter("SubComment", "upVoter");
        registry.registerSubcommentDownvoter("SubComment", "downVoter");
    }
}
