package gov.loc.repository.bagit.verify;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;
import gov.loc.repository.bagit.exceptions.FileNotInManifestException;

/**
 * Implements {@link SimpleFileVisitor} to ensure that the encountered file is in one of the manifests.
 */
public class PayloadFileExistsInAtLeastOneManifestVistor extends AbstractPayloadFileExistsInManifestsVistor {

    private transient final Set<Path> filesListedInManifests;

    public PayloadFileExistsInAtLeastOneManifestVistor(final Set<Path> filesListedInManifests, final boolean ignoreHiddenFiles) {
        super(ignoreHiddenFiles);
        this.filesListedInManifests = filesListedInManifests;
    }

    @Override
    public FileVisitResult visitFile(final Path path, final BasicFileAttributes attrs) throws FileNotInManifestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
