package gov.loc.repository.bagit.verify;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implements {@link SimpleFileVisitor} to ensure that the encountered file is in one of the manifests.
 */
public class FileCountAndTotalSizeVistor extends SimpleFileVisitor<Path> {

    private static final Logger logger = LoggerFactory.getLogger(FileCountAndTotalSizeVistor.class);

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private transient long totalSize;

    private transient long count;

    @Override
    public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attrs) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FileVisitResult visitFile(final Path path, final BasicFileAttributes attrs) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long getCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long getTotalSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
