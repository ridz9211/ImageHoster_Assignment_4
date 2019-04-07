package ImageHoster.service;

import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ImageHoster.model.Image;


/**
 * @author Ridvik
 *
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     * calling the getImage() method in the CommentRepository for returning a image.
     * @param imageId
     * @return Image
     */
    public Image getImage(Integer imageId) {
        return commentRepository.getImage(imageId);
    }

}
