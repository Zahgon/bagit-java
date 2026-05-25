package gov.loc.repository.bagit.verify;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gov.loc.repository.bagit.exceptions.CorruptChecksumException;
import gov.loc.repository.bagit.hash.Hasher;

/**
 * Checks a give file to make sure the given checksum hash matches the computed checksum hash.
 * This is thread safe so you can call many at a time.
 */
@SuppressWarnings("PMD.DoNotUseThreads")
public class CheckManifestHashesTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(CheckManifestHashesTask.class);

    private static final ResourceBundle messages = ResourceBundle.getBundle("MessageBundle");

    private transient final Entry<Path, String> entry;

    private transient final CountDownLatch latch;

    private transient final Collection<Exception> exceptions;

    private transient final String algorithm;

    public CheckManifestHashesTask(final Entry<Path, String> entry, final String algorithm, final CountDownLatch latch, final Collection<Exception> exceptions) {
        this.entry = entry;
        this.algorithm = algorithm;
        this.latch = latch;
        this.exceptions = exceptions;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static void checkManifestEntry(final Entry<Path, String> entry, final MessageDigest messageDigest, final String algorithm) throws IOException, CorruptChecksumException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
