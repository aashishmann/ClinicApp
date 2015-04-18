import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by aashish on 27/12/14.
 */
public class TestHib {
    public static void main(String args[]) throws Exception {
        Session session = null;
        org.hibernate.Transaction transaction = null;
        try {
            // Create Configuration object
            /*AnnotationConfiguration cfg = new AnnotationConfiguration()
                    .addAnnotatedClass(PromoCode.class)
                    .addAnnotatedClass(ComboTypeDetail.class)
                    .addAnnotatedClass(PromoCodeFilterSet.class)
                    .addAnnotatedClass(PromoCodePogFilter.class);*/
            AnnotationConfiguration cfg = new AnnotationConfiguration().addAnnotatedClass(TestTable.class);
            cfg.configure();

            // Create a session factory object
            SessionFactory sessionFactory = cfg.buildSessionFactory();

            // Create a session
            session = sessionFactory.openSession();

            // Define filters and filter set
            /*PromoCodePogFilter filter1 = new PromoCodePogFilter();
            filter1.setPogId(678899956L);
            PromoCodePogFilter filter2 = new PromoCodePogFilter();
            filter2.setPogId(678899945L);

            PromoCodeFilterSet promoCodeFilterSet = new PromoCodeFilterSet();
            Set<PromoCodePogFilter> promoCodePogFilterSet = new HashSet<PromoCodePogFilter>();
            promoCodePogFilterSet.add(filter1);
            promoCodePogFilterSet.add(filter2);
            promoCodeFilterSet.setPromoCampaignName("testCampaign");
            promoCodeFilterSet.setPromoCodePogFilterSet(promoCodePogFilterSet);

            filter1.setPromoCodeFilterSet(promoCodeFilterSet);
            filter2.setPromoCodeFilterSet(promoCodeFilterSet);

            // Define Combo Details
            ComboTypeDetail comboTypeDetails = new ComboTypeDetail();
            comboTypeDetails.setSubCartQty(1);
            comboTypeDetails.setRecursive(true);
            comboTypeDetails.setDiscountedQty(0);
            comboTypeDetails.setSubCartFilter(promoCodeFilterSet);

            // Define the promo code
            PromoCode promoCode = new PromoCode();
            promoCode.setCode("TestCode");
            promoCode.setPromoCodeFilterSet(promoCodeFilterSet);
            promoCode.setComboTypeDetail(comboTypeDetails);*/

            TestTable table = new TestTable();
            table.setName("ABC");
            // Start a transaction
            transaction = session.beginTransaction();

            /*session.save(promoCode);
            session.save(comboTypeDetails);
            session.save(promoCodeFilterSet);
            session.save(filter1);
            session.save(filter2);*/
            session.save(table);
            transaction.commit();
            System.out.println("Successfully Saved");
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
