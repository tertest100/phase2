package Suits;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;


import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"PackageA","PackageB"})
@IncludeTags({"qa","production"})
@ExcludeTags("qa")

			
public class JunitRunner {

}
