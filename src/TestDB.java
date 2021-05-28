import Container.LinkedQueue;
import mvc.model.client.*;
import mvc.model.dao.*;

public class TestDB
{
    public static void main(String[] args) {
        new TestDB();
    }

    public TestDB() {
        ClientDao clientDao = new ClientDao();
        Client client = new Client();

        LinkedQueue<Client> clientLinkedQueue = new LinkedQueue<Client>();
        clientLinkedQueue = clientDao.read(client);

        System.out.printf("--------Clients------"+"\n");
        for (int i = 0; i < clientLinkedQueue.getSize(); i++) {
            System.out.println(clientLinkedQueue.dequeue(i));
        }

        ClientEmployeeDao clientEmployeeDao = new ClientEmployeeDao();
        ClientEmployee clientEmployee = new ClientEmployee();

        LinkedQueue<ClientEmployee> clientEmployeeLinkedQueue = new LinkedQueue<ClientEmployee>();
        clientEmployeeLinkedQueue = clientEmployeeDao.read(clientEmployee);

        System.out.printf("--------ClientsEmployee------"+"\n");
        for (int i = 0; i < clientEmployeeLinkedQueue.getSize(); i++) {
            System.out.println(clientEmployeeLinkedQueue.dequeue(i));
        }

        InvoiceDao invoiceDao = new InvoiceDao();
        Invoice invoice = new Invoice();

        LinkedQueue<Invoice> invoiceLinkedQueue = new LinkedQueue<Invoice>();
        invoiceLinkedQueue = invoiceDao.read(invoice);

        System.out.printf("--------Invioce------"+"\n");
        for (int i = 0; i < invoiceLinkedQueue.getSize(); i++) {
            System.out.println(invoiceLinkedQueue.dequeue(i));
        }


        SalesDao salesDao = new SalesDao();
        Sales sales = new Sales();

        LinkedQueue<Sales> salesLinkedQueue = new LinkedQueue<Sales>();
        salesLinkedQueue = salesDao.read(sales);

        System.out.printf("--------Sales------"+"\n");
        for (int i = 0; i < salesLinkedQueue.getSize(); i++) {
            System.out.println(salesLinkedQueue.dequeue(i));
        }

        SupplierDao supplierDao = new SupplierDao();
        Supplier supplier = new Supplier();

        LinkedQueue<Supplier> supplierLinkedQueue = new LinkedQueue<Supplier>();
        supplierLinkedQueue = supplierDao.read(supplier);

        System.out.printf("--------Supplier------"+"\n");
        for (int i = 0; i < supplierLinkedQueue.getSize(); i++) {
            System.out.println(supplierLinkedQueue.dequeue(i));
        }

        MobileDao mobileDao = new MobileDao();
        Mobile mobile = new Mobile();

        LinkedQueue<Mobile> mobileLinkedQueue = new LinkedQueue<Mobile>();
        Mobile mobile1 = mobileDao.findById(mobile);

        System.out.printf("--------Mobile------"+"\n");

        System.out.println(mobile1);
      /*  for (int i = 0; i < mobileLinkedQueue.getSize(); i++) {
            System.out.println(mobileLinkedQueue.dequeue(i));
        }

       */
    }
}
