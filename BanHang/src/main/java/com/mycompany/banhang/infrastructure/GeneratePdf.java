/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banhang.infrastructure;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.DashedBorder;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thang
 */
public class GeneratePdf {

    public static void main(String[] args) {
        try {
            String pathString = "C:\\Users\\thang\\Downloads\\hello.pdf";
            PdfWriter pdfWriter = new PdfWriter(pathString);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            pdfDocument.setDefaultPageSize(PageSize.A7);
            Document document = new Document(pdfDocument);
            float twocol = 380f;
            float towcol150 = twocol + 150f;
            float threecol = 190f;
            float twocolclumWith[] = {towcol150, twocol};
            float threeColClumWith[] = {threecol, threecol, threecol};
            float fullwidth[] = {threecol * 3};
            Paragraph paragraph = new Paragraph("\n");
            Table table = new Table(twocolclumWith);
            table.addCell(new Cell().add(new Paragraph("POST")).setFontSize(5f).setBorder(Border.NO_BORDER).setBold());

            Table nestedtable = new Table(new float[]{twocol / 2, twocol / 2});
            nestedtable.addCell(getHeaderTextCell("mã").setFontSize(4f));
            nestedtable.addCell(getHeaderTextCellValue("123").setFontSize(3f));
            nestedtable.addCell(getHeaderTextCell("Date").setFontSize(4f));
            nestedtable.addCell(getHeaderTextCellValue(LocalDate.now().toString()).setFontSize(3f));
            table.addCell(nestedtable.setBorder(Border.NO_BORDER));

            Color myColor = new DeviceRgb(255, 100, 20);
            Border border = new SolidBorder(myColor, 1f / 2f);
            Table divider = new Table(fullwidth);
            divider.setBorder(border);

            document.add(table);
            document.add(paragraph);
            document.add(divider);
            document.add(paragraph);

            Table twoCollTable = new Table(twocolclumWith);
            twoCollTable.addCell(getBillingandShippingCell("Billing Information"));
            twoCollTable.addCell(getBillingandShippingCell("shipping Information"));
            document.add(twoCollTable.setMarginBottom(12f));

            Table twoCollTable2 = new Table(twocolclumWith);
            twoCollTable2.addCell(getCell10fLeft("company", Boolean.TRUE));
            twoCollTable2.addCell(getCell10fLeft("Name", Boolean.TRUE));
            twoCollTable2.addCell(getCell10fLeft("codding Error", Boolean.FALSE));
            twoCollTable2.addCell(getCell10fLeft("codding", Boolean.FALSE));
            document.add(twoCollTable2);

            Table twoCollTable3 = new Table(twocolclumWith);
            twoCollTable3.addCell(getCell10fLeft("Name", Boolean.TRUE));
            twoCollTable3.addCell(getCell10fLeft("Address", Boolean.TRUE));
            twoCollTable3.addCell(getCell10fLeft("Le Van A", Boolean.FALSE));
            twoCollTable3.addCell(getCell10fLeft("Ha Noi", Boolean.FALSE));
            document.add(twoCollTable3);

            float oneColunmWitdth[] = {towcol150};

            Table oneColTable = new Table(oneColunmWitdth);
            oneColTable.addCell(getCell10fLeft("Name", Boolean.TRUE));
            oneColTable.addCell(getCell10fLeft("Address", Boolean.TRUE));
            oneColTable.addCell(getCell10fLeft("Le Van A", Boolean.FALSE));
            oneColTable.addCell(getCell10fLeft("Ha Noi", Boolean.FALSE));
            document.add(oneColTable.setMarginBottom(10f));

            Table tableDivider2 = new Table(fullwidth);
            Border dgb = new DashedBorder(myColor, 0.5f);
            document.add(tableDivider2.setBorder(dgb));

            Paragraph productPara = new Paragraph("Products");
            document.add(productPara);

            Table threeColTable1 = new Table(threeColClumWith);
            threeColTable1.setBackgroundColor(myColor, 0.3f);
            threeColTable1.addCell(new Cell().add(new Paragraph("Description")).setFontSize(3f).setFontColor(myColor).setBorder(Border.NO_BORDER));
            threeColTable1.addCell(new Cell().add(new Paragraph("Quantity")).setFontSize(3f).setFontColor(myColor).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
            threeColTable1.addCell(new Cell().add(new Paragraph("Price")).setFontSize(3f).setFontColor(myColor).setTextAlignment(TextAlignment.RIGHT).setMarginRight(15f).setBorder(Border.NO_BORDER));
            document.add(threeColTable1);

            Table threeColTable2 = new Table(threeColClumWith);
            List<Object> list = new ArrayList<>();
            float totalSum = 0f;
            for (Object data : list) {
                float total = 0;
                totalSum += total;
                threeColTable2.addCell(new Cell().add(new Paragraph(data.toString())).setBorder(Border.NO_BORDER).setMarginLeft(10f));
                threeColTable2.addCell(new Cell().add(new Paragraph(data.toString())).setBold().setTextAlignment(TextAlignment.CENTER));
                threeColTable2.addCell(new Cell().add(new Paragraph(String.valueOf(total))).setTextAlignment(TextAlignment.RIGHT).setMarginRight(15f));
            }
            document.add(threeColTable2.setMarginBottom(20f));
            float oneTwo[] = {threecol+125f, threecol*2};
            Table threeColTable4 = new Table(oneTwo);
            threeColTable4.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
            threeColTable4.addCell(tableDivider2.setBorder(Border.NO_BORDER));
            document.add(threeColTable4);
            
            Table threeColTable3 = new Table(threeColClumWith);
            threeColTable3.addCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER).setMargin(10f));
            threeColTable3.addCell(new Cell().add(new Paragraph("Total")).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
            threeColTable3.addCell(new Cell().add(new Paragraph(String.valueOf(totalSum))).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT));
            document.add(threeColTable3);
            document.add(tableDivider2);
            document.add(paragraph);
            document.add(divider.setBorder(new SolidBorder(myColor, 1)).setMarginBottom(15f));
            
            Table footer = new Table(fullwidth);
            footer.addCell(new Cell().add(new Paragraph("")).setBold().setBorder(Border.NO_BORDER));
            document.add(footer);
           
            document.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Cell getHeaderTextCell(String textValue) {
        return new Cell().add(new Paragraph(textValue)).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT).setFontSize(4f);
    }

    public static Cell getHeaderTextCellValue(String textValue) {
        return new Cell().add(new Paragraph(textValue)).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT).setFontSize(3f);
    }

    public static Cell getBillingandShippingCell(String textValue) {
        return new Cell().add(new Paragraph(textValue)).setFontSize(12f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT).setFontSize(4f);
    }

    public static Cell getCell10fLeft(String textValue, Boolean isBoolean) {
        Cell cell = new Cell().add(new Paragraph(textValue)).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT).setFontSize(4f);
        return isBoolean ? cell.setBold() : cell;
    }
}
