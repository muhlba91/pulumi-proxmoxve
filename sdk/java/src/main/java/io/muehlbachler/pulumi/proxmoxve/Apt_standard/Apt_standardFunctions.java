// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Apt_standard;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import io.muehlbachler.pulumi.proxmoxve.Apt_standard.inputs.GetRepositoryArgs;
import io.muehlbachler.pulumi.proxmoxve.Apt_standard.inputs.GetRepositoryPlainArgs;
import io.muehlbachler.pulumi.proxmoxve.Apt_standard.outputs.GetRepositoryResult;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.util.concurrent.CompletableFuture;

public final class Apt_standardFunctions {
    /**
     * Retrieves an APT standard repository from a Proxmox VE cluster.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Apt_standard.Apt_standardFunctions;
     * import com.pulumi.proxmoxve.Apt.inputs.GetRepositoryArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Apt/standardFunctions.getRepository(GetRepositoryArgs.builder()
     *             .handle("no-subscription")
     *             .node("pve")
     *             .build());
     * 
     *         ctx.export("proxmoxVirtualEnvironmentAptStandardRepository", example.applyValue(getRepositoryResult -> getRepositoryResult));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args) {
        return getRepository(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an APT standard repository from a Proxmox VE cluster.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Apt_standard.Apt_standardFunctions;
     * import com.pulumi.proxmoxve.Apt.inputs.GetRepositoryArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Apt/standardFunctions.getRepository(GetRepositoryArgs.builder()
     *             .handle("no-subscription")
     *             .node("pve")
     *             .build());
     * 
     *         ctx.export("proxmoxVirtualEnvironmentAptStandardRepository", example.applyValue(getRepositoryResult -> getRepositoryResult));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args) {
        return getRepositoryPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an APT standard repository from a Proxmox VE cluster.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Apt_standard.Apt_standardFunctions;
     * import com.pulumi.proxmoxve.Apt.inputs.GetRepositoryArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Apt/standardFunctions.getRepository(GetRepositoryArgs.builder()
     *             .handle("no-subscription")
     *             .node("pve")
     *             .build());
     * 
     *         ctx.export("proxmoxVirtualEnvironmentAptStandardRepository", example.applyValue(getRepositoryResult -> getRepositoryResult));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:Apt/standard/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves an APT standard repository from a Proxmox VE cluster.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Apt_standard.Apt_standardFunctions;
     * import com.pulumi.proxmoxve.Apt.inputs.GetRepositoryArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Apt/standardFunctions.getRepository(GetRepositoryArgs.builder()
     *             .handle("no-subscription")
     *             .node("pve")
     *             .build());
     * 
     *         ctx.export("proxmoxVirtualEnvironmentAptStandardRepository", example.applyValue(getRepositoryResult -> getRepositoryResult));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:Apt/standard/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
}
