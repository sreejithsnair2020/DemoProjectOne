package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {

	@Test(priority = 1)
	public void testAddAdmin() throws IOException {
		String loginUserName = ExcelUtility.getStringData(1,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getStringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.signin();

		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		adminuserspage.clickAddAdminLink();
		adminuserspage.clickAddNewAdminButton();
		
		String loginUserNameAdmin = ExcelUtility.getStringData(0,0, "admin");
		String loginPasswordAdmin = ExcelUtility.getStringData(0,1, "admin");
		adminuserspage.enterNewAdminUsername(loginUserNameAdmin);
		adminuserspage.enterNewAdminPassword(loginPasswordAdmin);
		adminuserspage.selectUserType();
		adminuserspage.clickSaveAdminButton();
		
	}

}
